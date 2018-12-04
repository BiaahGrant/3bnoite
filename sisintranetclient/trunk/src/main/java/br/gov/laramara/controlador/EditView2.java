package br.gov.laramara.controlador;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import br.gov.laramara.dto.Car;
import br.gov.laramara.servico.CarService;
import java.util.Locale;

@ManagedBean(name="dtEditView")
@ViewScoped
public class EditView2 implements Serializable{
    private List<Car> cars1;
    private List<Car> cars2;
         
    @ManagedProperty("#{carService}")
    private CarService service;
    
    private List<Car> filteredCars;
     
    @PostConstruct
    public void init() {
        cars1 = service.createCars(10);
        cars2 = service.createCars(10);
    }
 
     public boolean filterByPrice(Object value, Object filter, Locale locale) {
        String filterText = (filter == null) ? null : filter.toString().trim();
        if(filterText == null||filterText.equals("")) {
            return true;
        }
         
        if(value == null) {
            return false;
        }
         
        return ((Comparable) value).compareTo(Integer.valueOf(filterText)) > 0;
    }
    
    
    public List<Car> getCars1() {
        return cars1;
    }
 
    public List<Car> getCars2() {
        return cars2;
    }
     
    public List<String> getBrands() {
        return service.getBrands();
    }
     
    public List<String> getColors() {
        return service.getColors();
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
     
    
    public List<Car> getFilteredCars() {
        return filteredCars;
    }
 
    public void setFilteredCars(List<Car> filteredCars) {
        this.filteredCars = filteredCars;
    }
 
}