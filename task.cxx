#include <iostream>
#include <iomanip>

int main() {
    double p;
    std::cin >> p;
    
    double result = 1.0 / (p * p * (1 - p));
    std::cout << std::fixed << std::setprecision(4) << result << std::endl;
    
    return 0;
}