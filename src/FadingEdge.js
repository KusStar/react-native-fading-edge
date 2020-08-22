import React from 'react'
import { requireNativeComponent, StyleSheet } from 'react-native'

const RNFadingEdge = requireNativeComponent('RNFadingEdge')

export const FadingEdge = ({
  top = 0,
  left = 0,
  bottom = 0,
  right = 0,
  children,
  style,
  ...otherProps
}) => (
  <RNFadingEdge
    style={[ { flex: 1 } , StyleSheet.flatten(style) ]}
    config={{ top, left, bottom, right }}
    {...otherProps}
  >
    {children}
  </RNFadingEdge>
)
