function sum(){
    var firstNum = document.getElementById("firstNumber").value;
    var secondNum = document.getElementById("secondNumber").value;
    var sum = parseInt(firstNum) + parseInt(secondNum);
    var vPar = document.createElement("p")

    document.getElementById("divSum").appendChild(vPar).innerHTML = "o valor da soma é " + sum;
}

function getHigherNumber(){
    var firstNum = document.getElementById("firstNumber").value;
    var secondNum = document.getElementById("secondNumber").value;

    var vPar = document.createElement("p");
    var resultado = "";
    var color = "";

    if(firstNum > secondNum){
        resultado = "Primeiro numero é maior";
        color = "red";
    }else if(firstNum < secondNum){
        resultado = "Segundo numero é maior";
        color = "lightgreen";
    }else if (firstNum == secondNum){
        resultado = "Ambos são iguais";
        color = "yellow"
    }
    vPar.innerHTML = resultado;
    vPar.style.backgroundColor = color
    vPar.style.borderRadius = "10px";
    document.getElementById("divSum").appendChild(vPar);
}

function showLetters() {
    var textInput = document.getElementById("textInput");
    var vPar = document.createElement("div"); 
    
    
    textInput.addEventListener("input", function() {
        document.getElementById("divExTwo").appendChild(vPar).innerHTML = textInput.value;
    });
}

window.onload = showLetters;

function showLength() {
    var textInput = document.getElementById("textInput");
    var vPar = document.createElement("div");
    document.getElementById("textLength").innerHTML = textInput.value.length;
  
    
}

function insertLine(){
    var tabela = document.getElementById("table"); // Obtém a tabela
    var numColunas = tabela.rows[0].cells.length; // Obtém o número de colunas da primeira linha
    var novaLinha = tabela.insertRow(-1); // Insere uma nova linha no final da tabela
  
    // Adiciona a mesma quantidade de células que há na primeira linha
    for (var i = 0; i < numColunas; i++) {
      var novaCelula = novaLinha.insertCell(i); // Cria uma nova célula
      novaCelula.innerHTML = `Nova Coluna ${i + 1}`; // Adiciona conteúdo à célula
    }
}


function onClickLiFood(){
    const listaDeComidas = document.querySelectorAll("#favoriteFood li");


        listaDeComidas.forEach(item => {
            console.log(item.textContent)
            item.addEventListener("click", () => {
                alert(item.textContent);
            });
        });
}

window.onload = onClickLiFood;

function changeCellColor(){
    const table = document.querySelectorAll("table td");


        table.forEach(item => {
            console.log(item.textContent)
            item.addEventListener("click", () => {
                item.style.backgroundColor = "red";
            });
        });
}

window.onload = changeCellColor;