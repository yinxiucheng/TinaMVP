package tina.com.tinamvp.model;

import java.util.List;

import tina.com.tinamvp.bean.Girl;

/**
 * @author yxc
 * @date 2018/11/19
 */
public interface IGirlModel {

    void loadGirl(GirlOnLoadListener girlOnLoadListener);


    interface GirlOnLoadListener{
        void onComplete(List<Girl> list);
    }




}
