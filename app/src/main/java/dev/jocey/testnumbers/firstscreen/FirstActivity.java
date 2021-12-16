package dev.jocey.testnumbers.firstscreen;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import dev.jocey.testnumbers.R;

public class FirstActivity extends AppCompatActivity {
    private EditText editText;
    private Button btnGetFact;
    private Button btnGetRandom;
    private RecyclerView recyclerView;
    private PresenterFirst presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        presenter = new PresenterFirst();
        btnGetFact.setOnClickListener(view -> {
            if ((editText.getText().length() > 0) && (TextUtils.isDigitsOnly(editText.getText())))
                presenter.getFact(editText.getText());
            else {
                editText.getText().clear();
                Toast.makeText(this, "Please input a number", Toast.LENGTH_SHORT).show();
            }

        });
        btnGetRandom.setOnClickListener(view -> presenter.getRandomFact());
    }

    public void init() {
        editText = findViewById(R.id.edittxt_num);
        btnGetFact = findViewById(R.id.btn_get_fact);
        btnGetRandom = findViewById(R.id.btn_get_random_fact);
        recyclerView = findViewById(R.id.recycler);
    }

}