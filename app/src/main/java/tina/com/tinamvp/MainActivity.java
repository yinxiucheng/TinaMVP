package tina.com.tinamvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

import tina.com.tinamvp.adapter.GirlAdapter;
import tina.com.tinamvp.bean.Girl;
import tina.com.tinamvp.prsenter.GirlPresenter;
import tina.com.tinamvp.view.IGirlView;

public class MainActivity extends AppCompatActivity implements IGirlView {

    ListView mListview;
    GirlPresenter mGirlPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListview = findViewById(R.id.list);

        mGirlPresenter = new GirlPresenter(this);
    }




    @Override
    public void showGirls(List<Girl> girls) {
        //model层的数据到girls中返回了
        mListview.setAdapter(new GirlAdapter(this, girls));

    }



}
