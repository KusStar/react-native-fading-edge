// CREDITS: These types are based on the original work made by all the people who contributed to @types/react-native

import * as React from 'react';
import * as ReactNative from 'react-native';

interface FadingEdgeProps extends ReactNative.ViewProps {
  // defaults to 0
  top?: number;
  // defaults to 0
  left?: number;
  // defaults to 0
  bottom?: number;
  // defaults to 0
  right?: number;
}
/**
 * @see https://github.com/KusStar/react-native-fading-edge
 */
declare class FadingEdgeComponent extends React.Component<FadingEdgeProps> {}
declare const FadingEdgeBase: typeof FadingEdgeComponent;
export default class FadingEdge extends FadingEdgeBase {}
