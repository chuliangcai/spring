package com.cyc.spring;

import com.cyc.spring.proecessors.MyTypeFilter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.io.File;
import java.util.*;

@SpringBootApplication
@ComponentScan(includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,classes = MyTypeFilter.class)})
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class,args);
    }
}
