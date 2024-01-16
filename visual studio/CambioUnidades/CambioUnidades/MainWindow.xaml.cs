using System.Collections.ObjectModel;
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

namespace CambioUnidades
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public ObservableCollection<String> unidades { get; set; }
        public MainWindow()
        {
            InitializeComponent();

            unidades = new ObservableCollection<String>();
            unidades.Add("Toneladas");
            unidades.Add("Kilos");
            unidades.Add("Gramos");

            this.DataContext = this;
        }

        private void btnConv_Click(object sender, RoutedEventArgs e)
        {
            int indx1 = cbUniBef.SelectedIndex;
            int indx2 = cbUniAft.SelectedIndex;

            int dif = indx1 - indx2;

            TextBox uni = (TextBox) txtUni;
            int unidades = Int32.Parse(uni.Text);

            if (dif == 0)
            {
                lbRes.Content = unidades;
                //lbRes.Content = dif;
            } 
            else if (dif < 0)
            {
                double res = unidades * (Math.Pow(1000, dif * -1));
                lbRes.Content = res;
                //lbRes.Content = dif;
            }
            else
            {
                double res = unidades / (Math.Pow(1000, dif));
                lbRes.Content = res;
                //lbRes.Content = dif;
            }
        }
    }
}