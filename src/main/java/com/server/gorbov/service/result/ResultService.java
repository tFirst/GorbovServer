package com.server.gorbov.service.result;

import com.server.gorbov.common.state.StateMain;
import com.server.gorbov.entity.Result;
import com.server.gorbov.entity.User;

public interface ResultService {

    StateMain findAllResults();

    StateMain findResultsByUserId(Integer userId);

    StateMain saveResult(User user, Result result);
}
