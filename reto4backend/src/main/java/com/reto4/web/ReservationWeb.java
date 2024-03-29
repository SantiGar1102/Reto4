package com.reto4.web;

import com.reto4.modelo.Message;
import com.reto4.modelo.Reservation;
import com.reto4.service.ReservationApi;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Santiago Garcia
 */
@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Reservation/")
public class ReservationWeb {
    /**
     * atriuto autowired reservation
     */
    @Autowired
    private ReservationApi reservationApi;

    /**
     * método para obtener todos los reservation
     * @return
     */
    @GetMapping("all")
    public List<Reservation> getAll(){
        return reservationApi.getAll();
    }

    /**
     * método para obtener cada reservation por id
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Optional<Reservation> getReservation(@PathVariable("id") int id){
        return reservationApi.getReservation(id);
    }

    /**
     * método para guardar cada reservation
     * @param reservation
     * @return
     */
    @PostMapping("save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation){
        return reservationApi.save(reservation);
    }

    /**
     * método para actualziar una reservación
     * @param reservation
     * @return
     */
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation update(@RequestBody Reservation reservation) {
        return reservationApi.update(reservation);
    }

    /**
     * método para borrar una reservación por id
     * @param reservationId
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int reservationId) {
        return reservationApi.deleteReservation(reservationId);
    }
}

