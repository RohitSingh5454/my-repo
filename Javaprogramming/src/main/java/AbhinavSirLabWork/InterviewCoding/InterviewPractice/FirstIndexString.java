package AbhinavSirLabWork.InterviewCoding.InterviewPractice;

import com.google.common.collect.ImmutableList;

public class FirstIndexString {
    public static void main(String[] args) {
        ImmutableList<String> inputNames = ImmutableList.of("Hello world","Rohit singh");
        inputNames.stream().map(i->i.split(" ")[0]).forEach(System.out::println);
    }
}
