package squareandcube.com.calculator;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
//import squareandcube.com.calculator.databinding.CalBinding;
import squareandcube.com.calculator.databinding.ActivityCalculatorBinding;
public class Calculator extends AppCompatActivity {

    private ActivityCalculatorBinding binding;
    private static final char ADDITION = '+';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private static final char SUBTRACTION = '-';
    private static final char SQUARE_ROOT ='√';
    private char CURRENT_ACTION;
    private double valueOne = 0.0;
    private double valueTwo=0.0;
    private double valueThree = Double.NaN;
    private DecimalFormat decimalFormat;



   public void buttonOne()
   {
       binding.buttonOne.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "1");

           }
       });
   }
   public void buttonTwo()
   {
       binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "2");

           }
       });
   }
   public void buttonThree()
   {
       binding.buttonThree.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "3");
           }
       });
   }
   public void buttonFour()
   {
       binding.buttonFour.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "4");
           }
       });
   }
   public void buttonDot()
   {
       binding.buttonDot.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + ".");

           }
       });
   }
   public void buttonZero()
   {
       binding.buttonZero.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "0");

           }
       });
   }
   public void buttonFive()
   {
       binding.buttonFive.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "5");
           }
       });
   }
   public void buttonSix()
   {
       binding.buttonSix.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "6");
           }
       });
   }
   public void buttonSeven()
   {
       binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "7");
           }
       });
   }
   public void buttonEight()
   {
       binding.buttonEight.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "8");
           }
       });
   }
   public void buttonNine()
   {
       binding.buttonNine.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               binding.editText.setText(binding.editText.getText() + "9");
           }
       });
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        decimalFormat = new DecimalFormat("#.##########");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_calculator);
        buttonOne();
        buttonTwo();
        buttonThree();
        buttonFour();
        buttonFive();
        buttonSix();
        buttonSeven();
        buttonEight();
        buttonNine();
        buttonZero();
        buttonDot();

        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                binding.textView.setText(decimalFormat.format(valueOne));
                binding.operator.setText("+");
                binding.finalTextView.setText("=");
                binding.editText.setText("");
            }
        });
        binding.buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION;
                binding.textView.setText(decimalFormat.format(valueOne));
                binding.operator.setText("-");
                binding.finalTextView.setText("=");
                binding.editText.setText("");
            }
        });

        binding.buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION;
                binding.textView.setText(decimalFormat.format(valueOne));
                binding.operator.setText("*");
                binding.finalTextView.setText("=");
                binding.editText.setText("");
            }
        });
        binding.buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = DIVISION;
                binding.textView.setText(decimalFormat.format(valueOne));
                binding.operator.setText("/");
                binding.finalTextView.setText("=");
                binding.editText.setText("");
            }
        });
        binding.buttonsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                computeCalculation();
                CURRENT_ACTION =SQUARE_ROOT;
                binding.textView.setText(decimalFormat.format(valueOne));
                binding.operator.setText("√");
                 binding.finalTextView.setText("=");
                 binding.editText.setText("");
                }

        });
        binding.buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                 computeCalculation();
                 if (valueTwo == 1) {
                     binding.textView.setText(decimalFormat.format(valueOne));
                 } else if (valueTwo == 0) {
                     binding.textView.setText(decimalFormat.format(valueOne));
                 } else {
                     binding.textView.setText(decimalFormat.format(valueOne));
                    /*binding.textView.setText(binding.textView.getText().toString() +
                            decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
                    */
                     valueOne = 0.0;
                     CURRENT_ACTION = '0';
                 }
              }
        });
        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                valueOne = 0.0;
                valueTwo = 0.0;
                binding.editText.setText("");
                binding.textView.setText("");
                binding.finalTextView.setText("");
                binding.operator.setText("");

            }
        });
        binding.buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.editText.getText().length() > 0) {
                    CharSequence currentText = binding.editText.getText();
                    binding.editText.setText(currentText.subSequence(0, currentText.length() - 1));
                }
            }
        });

        binding.buttonPersentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!binding.editText.getText().toString().equals("") && binding.textView.getText().toString().equals(""))
                {
                   String value = binding.editText.getText().toString();
                   double i = Double.parseDouble(value);
                   double obtainedScore = 0;
                   double value1 = (obtainedScore*100.0)/i;
                   binding.textView.setText(String.valueOf(value1));
                   binding.finalTextView.setText("=");
                   binding.editText.setText("");
                }
//                computeCalculation();
//                CURRENT_ACTION = ADDITION;
//                binding.textView.setText(decimalFormat.format(valueOne));
//                binding.operator.setText("+");
//                binding.finalTextView.setText("=");
//                binding.editText.setText("");
            }
        });

    }
    public void computeCalculation() {
        if ((valueOne)!=0.0)
        {
            String s = binding.editText.getText().toString();
            String op = binding.operator.getText().toString();
            String sqrt = "√";
            if (op == sqrt || CURRENT_ACTION ==SQUARE_ROOT) {

                String sqrt1 = String.valueOf(Math.sqrt(valueOne));
                valueOne=Double.parseDouble(sqrt1);
                binding.operator.setText("");
                binding.editText.setText("");

            }
            else
            {
            if (s.isEmpty()) {
                if (CURRENT_ACTION == ADDITION) {
                    binding.editText.setText("0");
                }
                if (CURRENT_ACTION == SUBTRACTION) {
                    binding.editText.setText("0");
                }
                if (CURRENT_ACTION == MULTIPLICATION) {
                    binding.editText.setText("1");
                }
                if (CURRENT_ACTION == DIVISION) {
                    binding.editText.setText("1");
                }
                valueTwo = Double.parseDouble((binding.editText.getText().toString()));
            } else {
                valueTwo = Double.parseDouble(binding.editText.getText().toString());
            }
        }
            binding.editText.setText(null);


            if (CURRENT_ACTION == ADDITION) {
                valueOne = this.valueOne + valueTwo;
                binding.operator.setText("");
            }
                 else if (CURRENT_ACTION == SUBTRACTION)
            {
                valueOne = this.valueOne - valueTwo;
                binding.operator.setText("");
            }
            else if (CURRENT_ACTION == MULTIPLICATION)
            {
                valueOne = this.valueOne * valueTwo;
                binding.operator.setText("");
            }
            else if (CURRENT_ACTION == DIVISION)
            {
                valueOne = this.valueOne / valueTwo;
                binding.operator.setText("");
            }
        } else {
            try {
                  valueOne = Double.parseDouble(binding.editText.getText().toString());
            } catch (Exception e) {
            }
        }

    }

            }
