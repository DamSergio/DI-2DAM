using System.Text;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Calculadora
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void btnSuma_Click(object sender, RoutedEventArgs e)
        {
            TextBox t1 = (TextBox) txt1;
            int n1 = Int32.Parse(t1.Text);

            TextBox t2 = (TextBox) txt2;
            int n2 = Int32.Parse(t2.Text);

            lbSol.Content = "Solucion: " + (n1 + n2);
        }

        private void btnResta_Click(object sender, RoutedEventArgs e)
        {
            TextBox t1 = (TextBox)txt1;
            int n1 = Int32.Parse(t1.Text);

            TextBox t2 = (TextBox)txt2;
            int n2 = Int32.Parse(t2.Text);

            lbSol.Content = "Solucion: " + (n1 - n2);
        }

        private void btnMult_Click(object sender, RoutedEventArgs e)
        {
            TextBox t1 = (TextBox)txt1;
            int n1 = Int32.Parse(t1.Text);

            TextBox t2 = (TextBox)txt2;
            int n2 = Int32.Parse(t2.Text);

            lbSol.Content = "Solucion: " + (n1 * n2);
        }

        private void btnDiv_Click(object sender, RoutedEventArgs e)
        {
            TextBox t1 = (TextBox)txt1;
            float n1 = float.Parse(t1.Text);

            TextBox t2 = (TextBox)txt2;
            float n2 = float.Parse(t2.Text);

            lbSol.Content = "Solucion: " + (n1 / n2);
        }
    }
}