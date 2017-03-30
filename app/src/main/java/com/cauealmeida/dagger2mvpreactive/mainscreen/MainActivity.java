package com.cauealmeida.dagger2mvpreactive.mainscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.cauealmeida.dagger2mvpreactive.App;
import com.cauealmeida.dagger2mvpreactive.R;
import com.cauealmeida.dagger2mvpreactive.data.component.DaggerNetComponent;
import com.cauealmeida.dagger2mvpreactive.data.model.Post;
import com.cauealmeida.dagger2mvpreactive.data.module.MainScreenModule;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainScreenContract.View {

    private ListView lvLista;
    private ArrayList<String> list = new ArrayList<>();
    private ArrayAdapter<String> adapter;

    @Inject
    MainScreenPresenter mainScreenPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvLista = (ListView) findViewById(R.id.lvLista);
        DaggerMainScreenComponent.builder()
                .netComponent(((App) getApplicationContext()).getNetComponent())
                .mainScreenModule(new MainScreenModule(this))
                .build().inject(this);

        mainScreenPresenter.loadPosts();
    }

    @Override
    public void showPosts(List<Post> posts) {
        for (int i = 0; i < posts.size(); i++) {
            list.add(posts.get(i).getTitle());
        }
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        lvLista.setAdapter(adapter);
    }

    @Override
    public void showError(String message) {
        Toast.makeText(getApplicationContext(), "Error" + message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showComplete() {
        Toast.makeText(getApplicationContext(), "Complete", Toast.LENGTH_SHORT).show();
    }
}
