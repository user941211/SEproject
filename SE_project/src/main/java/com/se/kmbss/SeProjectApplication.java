package com.se.kmbss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

// 프로그램을 시작하면 가장먼저 시작하게 된다.
// 건드릴 일은 거의 없다.

// src/main/resources/ 의 파일구조 설명
// mapper: 각종 쿼리문을 모으는 폴더
// static js, css파일을 모으는 폴더
// template: html파일을 모으는 폴더

// !! 작업 환경이 달라졌을 때 또는 처음 프로젝트 다운로드 받은 경우 !!
// DB접속 IO오류 발생 시, SE_project/src/main/resources/application.properties 파일 확인

@SpringBootApplication
public class SeProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SeProjectApplication.class, args);
	}

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return super.configure(builder);
    }

}
