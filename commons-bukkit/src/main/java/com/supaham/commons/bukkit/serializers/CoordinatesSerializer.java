package com.supaham.commons.bukkit.serializers;

import com.supaham.commons.bukkit.utils.CoordinatesUtils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import pluginbase.config.serializers.Serializer;
import pluginbase.minecraft.location.Coordinates;
import pluginbase.minecraft.location.FacingCoordinates;

/**
 * A {@link Coordinates} serializer. This serializer also supports {@link FacingCoordinates} and
 * serializes direction if necessary.
 *
 * @since 0.2.9.1
 */
public class CoordinatesSerializer implements Serializer<Coordinates> {

  @Override
  @Nullable
  public Object serialize(@Nullable final Coordinates coordinates) {
    return coordinates == null ? null : CoordinatesUtils.serialize(coordinates);
  }

  @Override
  @Nullable
  public Coordinates deserialize(@Nullable Object serialized, @NotNull Class wantedType)
      throws IllegalArgumentException {
    return serialized == null ? null : CoordinatesUtils.deserialize(serialized);
  }
}
