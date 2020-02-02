package com.example.demo;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Data
@ToString
public class SystemInfo {
    @Value("${environment}")
    private String environment;

    @Value("${version}")
    private String version;

    @Value("${canary}")
    private String canary;

    private String startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

}
