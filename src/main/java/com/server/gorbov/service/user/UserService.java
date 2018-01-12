package com.server.gorbov.service.user;

import com.server.gorbov.common.state.StateMain;
import com.server.gorbov.entity.User;

public interface UserService {

    User getUserById(Integer userId);

    StateMain auth(String userName, String userPassword);

    StateMain register(String userName, String userPassword);

    StateMain updUserRole(String userName, Integer role);
}
