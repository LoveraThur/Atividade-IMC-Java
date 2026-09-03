void main(){
    String nome = IO.readln("Digite seu nome:  ");
    char genero = IO.readln("Digite seu gênero(M: masculino, F: feminino, N: prefio não informar): ").charAt(0);
    String idadeStr = IO.readln("Digite sua idade: ");
    int idade = Integer.valueOf(idadeStr);
    String alturaStr = IO.readln("Digite sua altura: ");
    double altura = Double.valueOf(alturaStr);
    String pesoStr = IO.readln("Digite seu peso: ");
    double peso = Double.valueOf(pesoStr);

    double imc = peso/(altura*altura);
    
    System.out.printf("""
            Nome: %s
            Idade: %d
            Gênero: %c
            IMC: %.4f
            \n""", nome, idade, genero, imc);
    switch (genero) {
        case 'M', 'm':
            if (imc >= 40) {
                IO.println("Classificação: Obesidade Mórbida");
            }
            else if (imc >= 30) {
                IO.println("Classificação: Obesidade moderada");
                             
            }
            else if (imc >= 25) {
                IO.println("Classificação: Obesidade Leve");
            }
            else if (imc >= 20) {
                IO.println("Classificação: Normal");
            }
            else{
                IO.println("Classificação: Abaixo do normal");

            }
            break;
    
        case 'F', 'f', 'N', 'n':
            if (imc >= 39) {
                IO.println("Classificação: Obesidade Mórbida");
            }
            else if (imc >= 29) {
                IO.println("Classificação: Obesidade moderada");
                             
            }
            else if (imc >= 24) {
                IO.println("Classificação: Obesidade Leve");
            }
            else if (imc >= 19) {
                IO.println("Classificação: Normal");
            }
            else{
                IO.println("Classificação: Abaixo do normal");

            }
            break;
    
        default:
            break;
    }


}
