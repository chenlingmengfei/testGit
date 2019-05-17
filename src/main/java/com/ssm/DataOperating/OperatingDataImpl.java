package com.ssm.DataOperating;

public class OperatingDataImpl implements OperatingData{
    @Override
    public void updata() {
        System.out.println("添加数据....");
    }

    @Override
    public void detele() {
        System.out.println("删除数据.....");
    }

    @Override
    public void save() {
        System.out.println("修改数据.....");
    }

    @Override
    public void findAll() {
        System.out.println("查询数据.....");
    }
}
