package com.dailycodechallege.userservice.Service;

import com.dailycodechallege.userservice.Entity.User;
import com.dailycodechallege.userservice.Repository.UserRepository;
import com.dailycodechallege.userservice.VO.Department;
import com.dailycodechallege.userservice.VO.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;


    public User saveUser(User user)
    {
        return userRepository.save(user);
    }

    public ResponseTemplate getUser(Long userId) {
        User user = userRepository.findById(userId).get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/GetDepartment/"+user.getDepartmentID(),Department.class);
        ResponseTemplate responseTemplate = new ResponseTemplate();
        responseTemplate.setUser(user);
        responseTemplate.setDepartment(department);
        return  responseTemplate;

    }
}
