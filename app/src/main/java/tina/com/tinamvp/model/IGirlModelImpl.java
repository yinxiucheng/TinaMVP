package tina.com.tinamvp.model;

import java.util.ArrayList;
import java.util.List;

import tina.com.tinamvp.bean.Girl;

/**
 * @author yxc
 * @date 2018/11/19
 */
public class IGirlModelImpl implements  IGirlModel{


    @Override
    public void loadGirl(GirlOnLoadListener girlOnLoadListener) {
        List<Girl> data = new ArrayList<>();


        data.add(new Girl());
        data.add(new Girl());
        data.add(new Girl());
        data.add(new Girl());
        data.add(new Girl());

        data.add(new Girl());
        data.add(new Girl());
        data.add(new Girl());
        data.add(new Girl());

        girlOnLoadListener.onComplete(data);
    }

}
