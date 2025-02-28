package EMS.example.EMS.Entities;

import java.sql.Timestamp;

import EMS.example.EMS.Entities.Enums.AttendanceStatus;
import jakarta.persistence.*;

@Entity
@Table(name = "attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(nullable = false)
    private Timestamp checkIn;

    private Timestamp checkOut;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus status;


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

    public Timestamp getCheckIn() {
        return this.checkIn;
    }

    public void setCheckIn(Timestamp checkIn) {
        this.checkIn = checkIn;
    }

    public Timestamp getCheckOut() {
        return this.checkOut;
    }

    public void setCheckOut(Timestamp checkOut) {
        this.checkOut = checkOut;
    }

    public AttendanceStatus getStatus() {
        return this.status;
    }

    public void setStatus(AttendanceStatus status) {
        this.status = status;
    }
}