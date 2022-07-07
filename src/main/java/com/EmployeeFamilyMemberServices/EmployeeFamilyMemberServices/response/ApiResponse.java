package com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.response;

import com.EmployeeFamilyMemberServices.EmployeeFamilyMemberServices.Enum.ResponseStatus;

import lombok.Data;

@Data
public class ApiResponse<D> {
private ResponseStatus status;
private D data;
private Error error;

public  static <D> ApiResponse<D> success(final D data){
	final  ApiResponse<D> apiResponse =new ApiResponse<>();
	apiResponse.setStatus(ResponseStatus.SUCCESS);
	apiResponse.setError(null);
	apiResponse.setData(data);
	return apiResponse;
}
public  static <D> ApiResponse<D> error(final Error error){
	final  ApiResponse<D> apiResponse =new ApiResponse<>();
	apiResponse.setStatus(ResponseStatus.FAILURE);
	apiResponse.setError(error);
	apiResponse.setData(null);
	return apiResponse;
}

}
