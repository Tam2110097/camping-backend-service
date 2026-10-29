package vn.tamnguyen.controller.request;

import lombok.Getter;
import lombok.ToString;
import vn.tamnguyen.common.Gender;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@ToString
public class UserUpdateRequest implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
    private Gender gender;
    private Date dateOfBirth;
    private String username;
    private String email;
    private String phone;
    private List<AddressRequest> addresses;
}
