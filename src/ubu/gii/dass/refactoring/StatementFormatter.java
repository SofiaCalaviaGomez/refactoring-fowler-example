package ubu.gii.dass.refactoring;

	interface StatementFormatter {
        String header(String customerName);
        String lineItem(String movieTitle, double amount);
        String footer(double totalAmount, int frequentRenterPoints);
    }

