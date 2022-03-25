1+1
2*3

def alleKarten(x:Int) = "" + topBar(x) + zahlen(x) + subBar(x)
def eol = "\n"
def bar = "+-+ "
def topBar(x:Int) = print(bar * x + eol)
def subBar(x:Int) = print(eol + bar * x + eol)
def zahlen(x:Int) = for (i <- 1 to x){
    print("|" + i + "| ")
}
println(alleKarten(9))