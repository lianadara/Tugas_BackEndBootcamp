package com.multipolar.bootcamp.logging.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "access-logs-account")
@EqualsAndHashCode
public class AccessLog implements Serializable {
    @Id
    private String id;
    private String httpMethod;
    private String requestUrl;
    private Integer responseStatusCode;
    private String content;
    //    @Value("#{request.remoteAddr}")
    private String clientIP;
    //    @Value("#{request.remoteAddr}")
    private String userAgent;
    private LocalDateTime timeStamp = LocalDateTime.now();

}
