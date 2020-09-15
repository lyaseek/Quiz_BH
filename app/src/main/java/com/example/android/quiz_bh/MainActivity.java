package com.example.android.quiz_bh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.android.quiz_bh.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    int point = 0;
    boolean b;
    String name, answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editTextQ = (EditText) findViewById(R.id.editTextQ);
        final EditText editText = (EditText) findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                name = editable.toString();
            }
        });
        final Button button1_b = (Button) findViewById(R.id.button1_b);
        final Button button1_c = (Button) findViewById(R.id.button1_c);
        final Button button1_a = (Button) findViewById(R.id.button1_a);
        button1_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button1_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button1_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button1_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button1_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button1_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button1_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button1_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button1_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point += 5;
                button1_b.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                button1_a.setClickable(false);
                button1_b.setClickable(false);
                button1_c.setClickable(false);
            }
        });
        final Button button2_b = (Button) findViewById(R.id.button2_b);
        final Button button2_c = (Button) findViewById(R.id.button2_c);
        final Button button2_a = (Button) findViewById(R.id.button2_a);
        button2_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button2_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button2_b.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button2_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button2_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button2_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button2_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button2_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button2_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point += 5;
                button2_a.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                button2_a.setClickable(false);
                button2_b.setClickable(false);
                button2_c.setClickable(false);
            }
        });
        final Button button3_b = (Button) findViewById(R.id.button3_b);
        final Button button3_c = (Button) findViewById(R.id.button3_c);
        final Button button3_a = (Button) findViewById(R.id.button3_a);
        button3_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button3_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button3_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button3_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button3_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button3_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button3_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button3_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button3_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point += 5;
                button3_b.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                button3_a.setClickable(false);
                button3_b.setClickable(false);
                button3_c.setClickable(false);
            }
        });
        final Button button4_b = (Button) findViewById(R.id.button4_b);
        final Button button4_c = (Button) findViewById(R.id.button4_c);
        final Button button4_a = (Button) findViewById(R.id.button4_a);
        button4_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button4_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button4_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button4_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button4_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button4_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button4_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button4_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point += 5;
                button4_b.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                button4_a.setClickable(false);
                button4_b.setClickable(false);
                button4_c.setClickable(false);
            }
        });
        final Button button5_b = (Button) findViewById(R.id.button5_b);
        final Button button5_c = (Button) findViewById(R.id.button5_c);
        final Button button5_a = (Button) findViewById(R.id.button5_a);
        button5_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button5_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button5_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button5_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button5_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button5_c.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button5_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button5_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button5_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point += 5;
                button5_b.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                button5_a.setClickable(false);
                button5_b.setClickable(false);
                button5_c.setClickable(false);
            }
        });
        final Button button6_b = (Button) findViewById(R.id.button6_b);
        final Button button6_c = (Button) findViewById(R.id.button6_c);
        final Button button6_a = (Button) findViewById(R.id.button6_a);
        button6_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button6_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button6_a.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button6_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button6_c.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point -= 1;
                button6_b.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            }
        });
        button6_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button6_a.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                button6_b.setBackgroundColor(getResources().getColor(R.color.colorBackground));
                point += 5;
                button6_c.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                button6_a.setClickable(false);
                button6_b.setClickable(false);
                button6_c.setClickable(false);
            }
        });
        Button result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (point < 0) {
                    point = 0;
                }
                if (name == null) {
                    name = getString(R.string.earthling);
                } else if (name.equals("")) {
                    name = getString(R.string.stranger);
                }
                Toast.makeText(getApplicationContext(), name + ", you scored " + point + " points!", Toast.LENGTH_LONG).show();
            }
        });
        Button again = (Button) findViewById(R.id.again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().clear();
                editTextQ.getText().clear();
                recreate();
                RadioGroup rg_1 = (RadioGroup) findViewById(R.id.rg_1);
                RadioGroup rg_2 = (RadioGroup) findViewById(R.id.rg_2);
                RadioGroup rg_3 = (RadioGroup) findViewById(R.id.rg_3);
                RadioGroup rg_4 = (RadioGroup) findViewById(R.id.rg_4);
                RadioGroup rg_5 = (RadioGroup) findViewById(R.id.rg_5);
                RadioGroup rg_6 = (RadioGroup) findViewById(R.id.rg_6);
                rg_1.clearCheck();
                rg_2.clearCheck();
                rg_3.clearCheck();
                rg_4.clearCheck();
                rg_5.clearCheck();
                rg_6.clearCheck();
                CheckBox charge = (CheckBox) findViewById(R.id.charge);
                CheckBox spin = (CheckBox) findViewById(R.id.spin);
                CheckBox mass = (CheckBox) findViewById(R.id.mass);
                CheckBox hair = (CheckBox) findViewById(R.id.hair);
                charge.setChecked(false);
                spin.setChecked(false);
                mass.setChecked(false);
                hair.setChecked(false);
            }
        });
        editTextQ.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (b) {
                    editTextQ.setBackgroundColor(getResources().getColor(R.color.colorText));
                }
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                answer = editable.toString();
            }
        });
        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer == null) {
                    Toast.makeText(getApplicationContext(), "Enter the answer to question 8", Toast.LENGTH_LONG).show();
                } else if (answer.equals("")) {
                    Toast.makeText(getApplicationContext(), "Answer to question 8 is missing", Toast.LENGTH_LONG).show();
                } else {
                    Pattern ptrn = Pattern.compile("^([wW]+orm+(\\s|)+hole+(s|))$");
                    Matcher matcher = ptrn.matcher(answer);
                    if (matcher.matches()) {
                        editTextQ.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
                        point += 5;
                        editTextQ.setEnabled(false);
                    } else {
                        editTextQ.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
                        point--;
                        b = true;
                    }
                }
            }
        });
    }

    public void onCheckboxClicked(View view) {
        CheckBox charge = (CheckBox) findViewById(R.id.charge);
        CheckBox hair = (CheckBox) findViewById(R.id.hair);
        CheckBox spin = (CheckBox) findViewById(R.id.spin);
        CheckBox mass = (CheckBox) findViewById(R.id.mass);
        if (charge.isChecked()) {
            charge.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
        } else {
            charge.setBackgroundColor(getResources().getColor(R.color.colorBackground));
        }
        if (hair.isChecked()) {
            hair.setBackgroundColor(getResources().getColor(R.color.colorIncorrect));
            point -= 1;
        } else {
            hair.setBackgroundColor(getResources().getColor(R.color.colorBackground));
        }
        if (spin.isChecked()) {
            spin.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
        } else {
            spin.setBackgroundColor(getResources().getColor(R.color.colorBackground));
        }
        if (mass.isChecked()) {
            mass.setBackgroundColor(getResources().getColor(R.color.colorCorrect));
        } else {
            mass.setBackgroundColor(getResources().getColor(R.color.colorBackground));
        }
        if ((charge.isChecked() && mass.isChecked() && spin.isChecked()) && (!hair.isChecked())) {
            point += 5;
            charge.setClickable(false);
            mass.setClickable(false);
            spin.setClickable(false);
            hair.setClickable(false);
        }
    }
}