package sv.edu.ues.pam135.calculadorapam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnCero, btnBorrar, btnClear, btnEntre, btnIgual, btnMas, btnMenos, btnPor, btnPunto, btnRaiz, btnExp, btnParentesis;
    TextView texto;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    float result = 0.0f;
    String operacion = "";
    boolean p = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnCero = (Button) findViewById(R.id.btnCero);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnEntre = (Button) findViewById(R.id.btnEntre);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnMas = (Button) findViewById(R.id.btnMas);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnPor = (Button) findViewById(R.id.btnPor);
        btnPunto = (Button) findViewById(R.id.btnPunto);
        btnRaiz = (Button) findViewById(R.id.btnRaiz);
        btnExp = (Button) findViewById(R.id.btnExp);
        btnParentesis = (Button) findViewById(R.id.btnParentesis);
        texto = (TextView)findViewById(R.id.textView);
    }

    public void escribirCero(View view) {
        if (texto.getText().equals("0") && p == false){
            texto.setText("0");
        }else{
            texto.setText(texto.getText()+"0");
        }
    }

    public void escribirDos(View view) {

        if (texto.getText().equals("0") && p == false){
            texto.setText("2");
        }else{
            texto.setText(texto.getText()+"2");
        }
    }

    public void escribirUno(View view) {

        if (texto.getText().equals("0") && p == false){
            texto.setText("1");
        }else{
            texto.setText(texto.getText()+"1");
        }
    }

    public void escribirTres(View view) {
        if (texto.getText().equals("0") && p == false){
            texto.setText("3");
        }else{
            texto.setText(texto.getText()+"3");
        }
    }

    public void escribirSeis(View view) {
        if (texto.getText().equals("0") && p == false){
            texto.setText("6");
        }else{
            texto.setText(texto.getText()+"6");
        }
    }

    public void escribirCinco(View view) {
        if (texto.getText().equals("0") && p == false){
            texto.setText("5");
        }else{
            texto.setText(texto.getText()+"5");
        }
    }

    public void escribirCuatro(View view) {

        if (texto.getText().equals("0") && p == false){
            texto.setText("4");
        }else{
            texto.setText(texto.getText()+"4");
        }
    }

    public void escribirNueve(View view) {

        if (texto.getText().equals("0") && p == false){
            texto.setText("9");
        }else{
            texto.setText(texto.getText()+"9");
        }
    }

    public void escribirOcho(View view) {

        if (texto.getText().equals("0") && p == false){
            texto.setText("8");
        }else{
            texto.setText(texto.getText()+"8");
        }
    }

    public void escribirSiete(View view) {

        if (texto.getText().equals("0") && p == false){
            texto.setText("7");
        }else{
            texto.setText(texto.getText()+"7");
        }
    }

    public void escribirPunto(View view) {

        if (texto.getText().equals("0")){
            texto.setText("0.");
            p = true;
        }else if(p == false){
                texto.setText(texto.getText() + ".");
                p=true;
            }
    }

    public void Clear(View view) {
        texto.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operacion = "";
        p = false;
    }

    public Float num2Return(){
        return numero2 = Float.valueOf(texto.getText().subSequence((String.valueOf(numero1).length())+1, texto.getText().length()).toString());//optenemos el segundo numero concatenado en pantalla
    }
    public void igual(View view) {

        if (operacion.equals("/")){
            this.num2Return();
            if (numero2 == 0.0f){
                texto.setText("0");
                Toast.makeText(this, "OPERACIÓN NO VÁLIDA", Toast.LENGTH_LONG).show();
                p=false;
            }else {
                result = numero1 / numero2;
                texto.setText(String.valueOf(result));
            }
        }
        if (operacion.equals("X")){
            this.num2Return();
            result = numero1 * numero2;
            texto.setText(String.valueOf(result));
        }
        if (operacion.equals("+")){
            this.num2Return();
            result = numero1 + numero2;
            texto.setText(String.valueOf(result));
        }

        if (operacion.equals("-")){
            this.num2Return();
            result = numero1 - numero2;
            texto.setText(String.valueOf(result));
        }
        if (operacion.equals("√")){
            double resultRaiz = Math.sqrt(Double.valueOf(texto.getText().subSequence(1, texto.getText().length()).toString()));
            texto.setText(String.valueOf(resultRaiz));
        }

    }

    public void restar(View view) {
        if (texto.getText().toString().contains("√")){
            Toast.makeText(this, "NO SE ACEPTAN NUMEROS NEGATIVOS DENTRO DE RAIZ CUADRADA", Toast.LENGTH_LONG).show();
        }else{
            numero1 = Float.valueOf(texto.getText().toString());
            operacion = "-";
            texto.setText(String.valueOf(numero1)+"-");
            p = false;
        }

    }

    public void sumar(View view) {
        numero1 = Float.valueOf(texto.getText().toString());
        operacion = "+";
        texto.setText(String.valueOf(numero1)+"+");
        p = false;
    }

    public void multiplicar(View view) {
        numero1 = Float.valueOf(texto.getText().toString());
        operacion = "X";
        texto.setText(String.valueOf(numero1)+"X");
        p = false;
    }

    public void dividir(View view) {
        numero1 = Float.valueOf(texto.getText().toString());
        operacion = "/";
        texto.setText(String.valueOf(numero1)+"/");
        p = false;
    }

    public void elevarCuadrado(View view) {
    }

    public void raizCuadrada(View view) {
        //numero1 = Float.valueOf(texto.getText().toString());
        operacion = "√";
        texto.setText("√");
        p = false;
    }

    public void parentesis(View view) {
    }

    public void borrarUnNum(View view) {
    }
}