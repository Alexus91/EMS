package EMS.example.EMS.Entities;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;

@Table(name = "payroll")
public class Payroll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(nullable = false)
    private BigDecimal baseSalary;

    private BigDecimal deductions = BigDecimal.ZERO;
    private BigDecimal bonuses = BigDecimal.ZERO;

    @Column(insertable = false, updatable = false)
    private BigDecimal netSalary;

    @CreationTimestamp
    private Timestamp paymentDate;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public BigDecimal getBaseSalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BigDecimal getDeductions() {
        return this.deductions;
    }

    public void setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
    }

    public BigDecimal getBonuses() {
        return this.bonuses;
    }

    public void setBonuses(BigDecimal bonuses) {
        this.bonuses = bonuses;
    }

    public BigDecimal getNetSalary() {
        return this.netSalary;
    }

    public void setNetSalary(BigDecimal netSalary) {
        this.netSalary = netSalary;
    }

    public Timestamp getPaymentDate() {
        return this.paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }
}