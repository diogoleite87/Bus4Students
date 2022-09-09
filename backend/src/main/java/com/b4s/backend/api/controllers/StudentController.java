package com.b4s.backend.api.controllers;

import com.b4s.backend.domain.Student;
import com.b4s.backend.services.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/student")
@Api("Students API")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("{cpf}")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Student found"),
            @ApiResponse(code = 404, message = "Student not found")
    })
    @ResponseStatus(HttpStatus.OK)
    public Student getStudentByCpf(@PathVariable String cpf) {
        return studentService.getStudentByCpf(cpf);
    }
}
