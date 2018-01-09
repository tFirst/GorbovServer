package com.server.gorbov.service;

import com.server.gorbov.common.state.StateMain;

public interface UserService {

    StateMain auth(String userName, String userPassword);
}
