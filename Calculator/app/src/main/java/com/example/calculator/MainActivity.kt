package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calculator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            binding.inputText.append("1")
        }
        binding.btn2.setOnClickListener {
            binding.inputText.append("2")
        }
        binding.btn3.setOnClickListener {
            binding.inputText.append("3")
        }
        binding.btn4.setOnClickListener {
            binding.inputText.append("4")
        }
        binding.btn5.setOnClickListener {
            binding.inputText.append("5")
        }
        binding.btn6.setOnClickListener {
            binding.inputText.append("6")
        }
        binding.btn7.setOnClickListener {
            binding.inputText.append("7")
        }
        binding.btn8.setOnClickListener {
            binding.inputText.append("8")
        }
        binding.btn9.setOnClickListener {
            binding.inputText.append("9")
        }
        binding.btn0.setOnClickListener {
            binding.inputText.append("0")
        }
        binding.btnAdd.setOnClickListener {
            binding.inputText.append("+")
        }
        binding.btnSubtract.setOnClickListener {
            binding.inputText.append("-")
        }
        binding.btnMultiply.setOnClickListener {
            binding.inputText.append("*")
        }
        binding.btnDivide.setOnClickListener {
            binding.inputText.append("/")
        }
        binding.btnModuloDivide.setOnClickListener {
            binding.inputText.append("%")
        }
        binding.btnOpenBracket.setOnClickListener {
            binding.inputText.append("(")
        }
        binding.btnCloseBracket.setOnClickListener {
            binding.inputText.append(")")
        }
        binding.btnDot.setOnClickListener {
            binding.inputText.append(".")
        }
        binding.btnAC.setOnClickListener {
            binding.inputText.text=""
            binding.outputText.text=""
        }
        binding.btnEqual.setOnClickListener {

            val expression = ExpressionBuilder(binding.inputText.text.toString()).build()
            val result = expression.evaluate()
            val longResult = result.toLong()

            if(longResult.toDouble() == result){
                binding.outputText.text = longResult.toString()
            }else{
                binding.outputText.text = result.toString()
            }

        }
    }
}