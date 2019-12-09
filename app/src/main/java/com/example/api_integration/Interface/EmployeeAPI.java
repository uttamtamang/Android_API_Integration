package com.example.api_integration.Interface;


import com.example.api_integration.model.Employee;
import com.example.api_integration.model.EmployeeCUD;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface EmployeeAPI {

    @GET("employees")
    Call<List<Employee>> getEmployee();

    @POST("create")
    Call<Void> registerEmployee(@Body EmployeeCUD emp);

    @GET("employee/{empID}")
    Call<Employee> getEmployeeByID (@Path("empID") int empId);
}
