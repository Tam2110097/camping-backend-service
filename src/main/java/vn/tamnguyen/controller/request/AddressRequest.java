package vn.tamnguyen.controller.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
//hoặc có thể dùng @Builder nếu không dùng @Setter
public class AddressRequest implements Serializable {

    private String apartmentNumber;
    private String floor;
    private String building;
    private String streetNumber;
    private String street;
    private String city;
    private String country;
    private Integer addressType;
}
