package jp.techacademy.watanabe.shouta.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ポチ", 3);

        dog.say();
        dog.move();

        Human human = new Human("しょうた", 21, "ゲーム");
        human.say();
        human.think();
    }
}
