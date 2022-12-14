package com.example.dogadjaji213.dto.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class EventReqDto {
    private String name;
    private LocalDate date;
    private String description;
    private String picUrl;
    private UUID locationID;
    private UUID categoryID;
}
