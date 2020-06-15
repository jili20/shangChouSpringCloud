package com.atguigu.spring.cloud.factory;

import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.spring.cloud.api.EmployeeRemoteService;
import com.atguigu.spring.cloud.entity.Employee;
import com.atguigu.spring.cloud.util.ResultEntity;

import feign.hystrix.FallbackFactory;
/**
 * 1.实现Consumer端服务降级功能
 * 2.实现FallbackFactory 接口时要传入 @FeignClient注解标记的接口类型
 * 3.在create()方法中返回@FeignClient注解标记的接口类型的对象，当Provider调用失败后，会执行这个对象的对应方法
 * @author bing
 */
@Component 
public class MyFallBackFactory implements FallbackFactory<EmployeeRemoteService>{

	@Override
	public EmployeeRemoteService create(Throwable cause) {
		return new EmployeeRemoteService() {
			
			@Override
			public List<Employee> getEmployeeRemote(String keyword) {
				return null;
			}
			
			@Override
			public Employee getEmployeeRemote() {
				return null;
			} 
			
			@Override
			public ResultEntity<Employee> getEmpWithCircuitBreaker(String signal) {
				return ResultEntity.failed("降级机制生效："+cause.getMessage()); 
			}
		};
			  
	}
}
