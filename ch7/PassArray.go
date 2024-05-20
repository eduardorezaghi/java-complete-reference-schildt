package main
import "fmt"

// PassArray.go - Pass an array to a function
// Compile & run: go run PassArray.go

func vaTest(v []int) {
    fmt.Printf("Number of args: %d Contents: ", len(v))
    
    for _, x := range v {
        fmt.Printf("%d ", x)
    }
    
    fmt.Println()
}

func main() {
    // Notice how we can pass an array to a function
    n1 := []int{10}
    n2 := []int{1, 2, 3}
    n3 := []int{}
    
    vaTest(n1) // 1 arg
    vaTest(n2) // 3 args
    vaTest(n3) // 0 args
}