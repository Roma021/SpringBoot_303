package springboot_303.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CourseRepository repository;
    @Override
    public void run(String... args) throws Exception{
        Course course = new Course("Astrophysiscs", "Neil D Tyson",
                "Just a course on stars", 3);
        repository.save(course);


        course = new Course("Calculus", "Carol Henley", "Rate of Change of the Rate of Change", 3);
        repository.save(course);

        course = new Course("Freshman English", "Geraldine Pegram",
                "Learn your language children", 3);
        repository.save(course);


    }
}
