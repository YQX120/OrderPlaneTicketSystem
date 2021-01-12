package cn.edu.hcnu.bean;

import java.util.Date;
import java.util.Set;

public class Customer {
    private String id;//没有业务意义
    private String customerType;//乘客类型：成人、儿童、婴儿
    private String name;//乘客姓名
    private String phone;//乘客电话号码
    private String CardID;//乘客身份证号码
    private Date birthdate;//出生日期
    private Set<Orders> orderset;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String cardID) {
        CardID = cardID;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
