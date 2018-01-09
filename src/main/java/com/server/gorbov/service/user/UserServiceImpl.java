package com.server.gorbov.service.user;

import com.server.gorbov.Codes;
import com.server.gorbov.common.state.StateMain;
import com.server.gorbov.entity.User;
import com.server.gorbov.repository.RoleRepository;
import com.server.gorbov.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    final UserRepository userRepository;
    final RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public StateMain auth(String userName, String userPassword) {
        StateMain stateMain = new StateMain();

        User user = userRepository.findUserByName(userName);
        if (user == null) {
            stateMain.setErrorCode(Codes.USER_NOT_EXIST);
            return stateMain;
        } else if (!user.getPassword().equals(userPassword)) {
            stateMain.setErrorCode(Codes.INVALID_PASSWORD);
            return stateMain;
        } else {
            stateMain.setErrorCode(Codes.SUCCESS);
        }

        return stateMain;
    }
}
