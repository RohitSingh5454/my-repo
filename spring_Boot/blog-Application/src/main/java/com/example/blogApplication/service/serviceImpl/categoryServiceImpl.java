package com.example.blogApplication.service.serviceImpl;

import com.example.blogApplication.entity.Category;
import com.example.blogApplication.exception.ResourceNotFoundException;
import com.example.blogApplication.payloads.DtoCategory;
import com.example.blogApplication.repository.categoryRepository;
import com.example.blogApplication.service.categoryService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class categoryServiceImpl implements categoryService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    categoryRepository categoryRepository;
    @Override
    public DtoCategory createCategory(DtoCategory dtoCategory) {
        Category cat=this.dtoToCategory(dtoCategory);
        Category addedCat=this.categoryRepository.save(cat);
        return this.catToDto(addedCat);
    }

    @Override
    public DtoCategory updateCategory(DtoCategory dtoCategory, Integer categoryId) {
        Category catById=this.categoryRepository.findById(categoryId).
                orElseThrow(()->new ResourceNotFoundException("category","categoryId",categoryId));
           catById.setCategoryTitle(dtoCategory.getCategoryTitle());
           catById.setCategoryDescription(dtoCategory.getCategoryDescription());
           Category updatedCat=this.categoryRepository.save(catById);
           return this.modelMapper.map(updatedCat,DtoCategory.class);
    }


    @Override
    public String deleteCategory(Integer categoryId) {
        Category findCatById=this.categoryRepository.findById(categoryId).
                orElseThrow(()->new ResourceNotFoundException("Category","categoryId",categoryId));
        this.categoryRepository.delete(findCatById);
        return "Category deleted";
    }

    @Override
    public DtoCategory getCategoryById(Integer categoryId) {
        Category getCategoryById=this.categoryRepository.findById(categoryId).
                orElseThrow(()->new ResourceNotFoundException("Category","categoryId",categoryId));
        return this.modelMapper.map(getCategoryById, DtoCategory.class);
    }

    @Override
    public List<DtoCategory> getAllCategory() {
        List<Category> categories=this.categoryRepository.findAll();
        List<DtoCategory> catDtos=categories.stream().
                map((cat)->this.modelMapper.map(cat, DtoCategory.class)).collect(Collectors.toList());
        return catDtos;
    }
    public Category dtoToCategory(DtoCategory dtoCategory){
        Category mapDtoToCategory=this.modelMapper.map(dtoCategory,Category.class);
        return mapDtoToCategory;
    }
    public DtoCategory catToDto(Category category){
        DtoCategory mapCatToDto=this.modelMapper.map(category,DtoCategory.class);
        return mapCatToDto;
    }
}
