package com.example.javaapp.common

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.data.web.config.EnableSpringDataWebSupport
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.thymeleaf.dialect.springdata.SpringDataDialect

@Configuration
@EnableSpringDataWebSupport
class WebConfig(
    @Autowired val env: Environment
) : WebMvcConfigurer {

    @Bean
    fun modelMapper(): ModelMapper {
        return ModelMapper()
    }

    @Bean
    fun layoutDialect(): LayoutDialect {
        return LayoutDialect()
    }

    @Bean
    fun springDataDialect(): SpringDataDialect {
        return SpringDataDialect()
    }
}
