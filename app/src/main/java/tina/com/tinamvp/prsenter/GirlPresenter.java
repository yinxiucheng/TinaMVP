package tina.com.tinamvp.prsenter;

import java.lang.ref.WeakReference;
import java.util.List;

import tina.com.tinamvp.bean.Girl;
import tina.com.tinamvp.model.IGirlModel;
import tina.com.tinamvp.model.IGirlModelImpl;
import tina.com.tinamvp.view.IGirlView;

/**
 * @author yxc
 * @date 2018/11/19
 */
public class GirlPresenter<T extends  IGirlView>{
    //1.view 层的引用
    WeakReference<T> mView;

    //2.
    IGirlModel iGirlModel = new IGirlModelImpl();

    public GirlPresenter(T view){
        this.mView = new WeakReference<>(view);

    }


    //3. 执行UI逻辑操作
    public void fetch(){
        if (mView.get() != null && iGirlModel != null){
            iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                @Override
                public void onComplete(List<Girl> list) {
                    mView.get().showGirls(list);


                }
            });
        }
    }


}
