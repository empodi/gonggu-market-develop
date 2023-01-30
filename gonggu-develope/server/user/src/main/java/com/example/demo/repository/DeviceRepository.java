package com.example.demo.repository;

import com.example.demo.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface DeviceRepository extends JpaRepository<Device, Long> {
    Optional<Device> findByEndpoint(String endpoint);
}
