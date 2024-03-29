package com.floristicboom.utils.mappers;

import com.floristicboom.address.model.Address;
import com.floristicboom.address.model.AddressDTO;
import com.floristicboom.auth.models.RegisterRequest;
import com.floristicboom.bonus.model.Bonus;
import com.floristicboom.bonus.model.BonusDTO;
import com.floristicboom.bouquet.model.Bouquet;
import com.floristicboom.bouquet.model.BouquetCreationRequest;
import com.floristicboom.bouquet.model.BouquetDTO;
import com.floristicboom.delivery.model.Delivery;
import com.floristicboom.delivery.model.DeliveryDTO;
import com.floristicboom.delivery.type.model.DeliveryType;
import com.floristicboom.delivery.type.model.DeliveryTypeDTO;
import com.floristicboom.flower.model.Flower;
import com.floristicboom.flower.model.FlowerDTO;
import com.floristicboom.purchase.model.Purchase;
import com.floristicboom.purchase.model.PurchaseDTO;
import com.floristicboom.purchasebouquet.model.PurchaseBouquet;
import com.floristicboom.purchasebouquet.model.PurchaseBouquetDTO;
import com.floristicboom.user.model.User;
import com.floristicboom.user.model.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EntityToDtoMapper {
    FlowerDTO toFlowerDTO(Flower flower);

    Flower toFlower(FlowerDTO flowerDTO);

    DeliveryType toDeliveryType(DeliveryTypeDTO deliveryTypeDTO);

    DeliveryTypeDTO toDeliveryTypeDTO(DeliveryType deliveryType);

    BonusDTO toBonusDTO(Bonus bonus);

    Bonus toBonus(BonusDTO bonusDTO);

    UserDTO toUserDTO(User user);

    User toUser(RegisterRequest registerRequest);

    User toUser(UserDTO userDTO);

    BouquetDTO toBouquetDTO(Bouquet bouquet);

    @Mapping(target = "flowers", ignore = true)
    Bouquet toBouquet(BouquetCreationRequest bouquetCreationRequest);

    Bouquet toBouquet(BouquetDTO bouquetDTO);

    Address toAddress(AddressDTO addressDTO);

    AddressDTO toAddressDTO(Address address);

    Delivery toDelivery(DeliveryDTO deliveryDTO);

    DeliveryDTO toDeliveryDTO(Delivery delivery);

    PurchaseBouquet toPurchaseBouquet(PurchaseBouquetDTO purchaseBouquetDTO);

    PurchaseBouquetDTO toPurchaseBouquetDTO(PurchaseBouquet purchaseBouquet);

    PurchaseDTO toPurchaseDTO(Purchase purchase);
}