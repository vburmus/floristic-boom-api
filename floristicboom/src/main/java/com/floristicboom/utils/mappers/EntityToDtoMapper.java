package com.floristicboom.utils.mappers;

import com.floristicboom.bonus.model.Bonus;
import com.floristicboom.bonus.model.BonusDTO;
import com.floristicboom.delivery.type.model.DeliveryType;
import com.floristicboom.delivery.type.model.DeliveryTypeDTO;
import com.floristicboom.flower.model.Flower;
import com.floristicboom.flower.model.FlowerDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EntityToDtoMapper {
    FlowerDTO toFlowerDTO(Flower flower);

    Flower toFlower(FlowerDTO flowerDTO);

    DeliveryType toDeliveryType(DeliveryTypeDTO deliveryTypeDTO);

    DeliveryTypeDTO toDeliveryTypeDTO(DeliveryType deliveryType);

    BonusDTO toBonusDTO(Bonus bonus);

    Bonus toBonus(BonusDTO bonusDTO);
}