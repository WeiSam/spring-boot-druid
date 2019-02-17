package com.sam.springboot.springbootdruid.Mapper;

import com.sam.springboot.springbootdruid.model.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select("select * FROM department WHERE id = #{id}")
    public Department getDepartmentById(Integer id);

    @Delete("delete from department where id = #{id}")
    public int deleteDepartmentById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDepartment(Department department);

    @Update("update department set departmentName = #{departmentName} where id = #{id}")
    public int updateDepartmentById(Department department);

}
