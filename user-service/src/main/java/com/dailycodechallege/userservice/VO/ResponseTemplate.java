package com.dailycodechallege.userservice.VO;

import com.dailycodechallege.userservice.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {

    Department department;
    User user;
}
