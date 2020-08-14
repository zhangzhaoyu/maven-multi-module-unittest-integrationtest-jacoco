package cn.cincout.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhaoyu on 2020/8/12.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Service
public class SendMsgServiceImpl implements SendMsgService {

    @Override
    public boolean sendMsg(String msg) {
        System.out.println("call msg queue success");
        return true;
    }
}

