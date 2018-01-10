package com.server.gorbov.service.user;

import com.server.gorbov.common.state.StateMain;

public interface UserService {

    StateMain auth(String userName, String userPassword);

    StateMain register(String userName, String userPassword);

    StateMain updUserRole(String userName, Integer role);
}
